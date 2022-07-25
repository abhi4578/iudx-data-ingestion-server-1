package iudx.data.ingestion.server.metering.util;

import static iudx.data.ingestion.server.metering.util.Constants.API;
import static iudx.data.ingestion.server.metering.util.Constants.DATABASE_TABLE_NAME;
import static iudx.data.ingestion.server.metering.util.Constants.ID;
import static iudx.data.ingestion.server.metering.util.Constants.QUERY_KEY;
import static iudx.data.ingestion.server.metering.util.Constants.RESPONSE_SIZE;
import static iudx.data.ingestion.server.metering.util.Constants.USER_ID;
import static iudx.data.ingestion.server.metering.util.Constants.WRITE_QUERY;

import io.vertx.core.json.JsonObject;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueryBuilder {

  private static final Logger LOGGER = LogManager.getLogger(QueryBuilder.class);

  public JsonObject buildWritingQuery(JsonObject request) {

    String primaryKey = UUID.randomUUID().toString().replace("-", "");
    String userId = request.getString(USER_ID);
    String resourceId = request.getString(ID);
    String providerID =
        resourceId.substring(0, resourceId.indexOf('/', resourceId.indexOf('/') + 1));
    String api = request.getString(API);
    String databaseTableName= request.getString(DATABASE_TABLE_NAME);
    Long response_size= request.getLong(RESPONSE_SIZE);
    ZonedDateTime zst = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    long time = getEpochTime(zst);
    String isoTime =
        LocalDateTime.now()
            .atZone(ZoneId.of("Asia/Kolkata"))
            .truncatedTo(ChronoUnit.SECONDS)
            .toString();
    StringBuilder query =
        new StringBuilder(
            WRITE_QUERY
                .replace("$0", databaseTableName)
                .replace("$1", primaryKey)
                .replace("$2", api)
                .replace("$3", userId)
                .replace("$4", Long.toString(time))
                .replace("$5", resourceId)
                .replace("$6", isoTime)
                .replace("$7", providerID)
                .replace("$8", Long.toString(response_size)));

    LOGGER.trace("Info: Query " + query);
    return new JsonObject().put(QUERY_KEY, query);
  }

  private long getEpochTime(ZonedDateTime time) {
    return time.toInstant().toEpochMilli();
  }
}
