package iudx.data.ingestion.server.authenticator;

public class JwtTokenHelper {

  static String openConsumerApiToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxNTA1MSwiaWF0IjoxNjI4NjcxODUxLCJpaWQiOiJyczpmb29iYXIuaXVkeC5pbyIsInJvbGUiOiJjb25zdW1lciIsImNvbnMiOnsiYWNjZXNzIjpbImFwaSJdfX0.Ye-N5ub6O6y083ju6QOFo04RDX-o00Unit25X9BAVXJUZR-FOsV3F94_XvDQgpUppBRNzp4bG0UXteZmbdHAdA";
  static String openConsumerSubsToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxNTUwNSwiaWF0IjoxNjI4NjcyMzA1LCJpaWQiOiJyczpmb29iYXIuaXVkeC5pbyIsInJvbGUiOiJjb25zdW1lciIsImNvbnMiOnsiYWNjZXNzIjpbInN1YnMiXX19.1ovYduPYI5tz0cVp7ZwUNKpRclZFbBUwJslhSfjGQLA41XeHNXaW1azPjMsUtn7Dnk-6Bt-K6YLhj3Nx6Qrlww";
  static String closedConsumerApiToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiIzMmE0Yjk3OS00ZjRhLTRjNDQtYjBjMy0yZmUxMDk5NTJiNWYiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMjM3MSwiaWF0IjoxNjI4NjY5MTcxLCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6ImNvbnN1bWVyIiwiY29ucyI6eyJhY2Nlc3MiOlsiYXBpIl19fQ.bDUtPLGQrIPeRm7l4n4kY_9Q5MDTJ3IxpgWJVqp_VSrQdNffTyZNFVBSxrJjpTsz7CYX7jjA30SvIMO7Cy5-ug";
  static String closedConsumerApiSubsToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMzM3NSwiaWF0IjoxNjI4NjcwMTc1LCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6ImNvbnN1bWVyIiwiY29ucyI6eyJhY2Nlc3MiOlsiYXBpIiwic3VicyJdfX0.OtyuR4x5Tl8tDEYfM0vOYiO48laIksTx0gNHtoYApHsdbxuyLoupyOuifi86mPPYiKAgSgy7-hDI1lyCOnv0BQ";

  static String closedProviderSubsToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMjc1NSwiaWF0IjoxNjI4NjY5NTU1LCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6InByb3ZpZGVyIiwiY29ucyI6eyJhY2Nlc3MiOlsic3VicyJdfX0.pKnycnea-iif67Elvrj5zRzWioDaNrF4ttls0xivSDGXFBmvJTlSz-71hF61bDb9a_Ug8_j-aIQ8vNfRN7sk8Q";
  static String closedProviderIngestToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMzE0OCwiaWF0IjoxNjI4NjY5OTQ4LCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6InByb3ZpZGVyIiwiY29ucyI6eyJhY2Nlc3MiOlsiaW5nZXN0aW9uIiwiZmlsZSJdfX0.jOqw3FEo1i4yfkxMakGXqz5T2_S4EdaA5gEJLVTHsvY3Uop9pinlDwKDfq724WLooorSJygdbe_SFqq90XxQWQ";
  static String closedProviderApiToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMzI1NiwiaWF0IjoxNjI4NjcwMDU2LCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6InByb3ZpZGVyIiwiY29ucyI6eyJhY2Nlc3MiOlsiYXBpIl19fQ.e6KkhiKDOWfzeVZHEfacV_tzTYYILQN_uahSUOaSHQQvmzAUowDc4antvPcc-2xFnFHTId-e3w7ZMZac_ik2oA";

  static String closedDelegateApiToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMzYwMCwiaWF0IjoxNjI4NjcwNDAwLCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6ImRlbGVnYXRlIiwiY29ucyI6eyJhY2Nlc3MiOlsiYXBpIiwic3VicyJdfX0.YQ892uxIJgBnBSmWOsQGW7OHTd_CBfbTsW0B4TzJ2z9tyP4qlHPYWx0KzofH7tRzSJls4qJ2Ma3ME4u4K0-7gw";
  static String closedDelegateIngestToken =
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJzdWIiOiJhMTNlYjk1NS1jNjkxLTRmZDMtYjIwMC1mMThiYzc4ODEwYjUiLCJpc3MiOiJhdXRoLnRlc3QuY29tIiwiYXVkIjoicnMuaXVkeC5pbyIsImV4cCI6MTYyODcxMzUyOCwiaWF0IjoxNjI4NjcwMzI4LCJpaWQiOiJyZzpleGFtcGxlLmNvbS83OWU3YmZhNjJmYWQ2Yzc2NWJhYzY5MTU0YzJmMjRjOTRjOTUyMjBhL3Jlc291cmNlLWdyb3VwIiwicm9sZSI6ImRlbGVnYXRlIiwiY29ucyI6eyJhY2Nlc3MiOlsiaW5nZXN0aW9uIl19fQ.d3KUAj08phMyLlR2xQr_SpMqQYWxGgkOyrd9D9GopLzyE6v22t-qkMxIzI5ufTU_m7iIzNV--T6Jb9X4VQTZQw";

}