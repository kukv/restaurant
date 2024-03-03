package jp.kukv.reservations.configuration.openapi.response;

public class Conflict {

  public static final String code = "409";
  public static final String description = "Duplicate resource registration.";

  Conflict() {}
}
