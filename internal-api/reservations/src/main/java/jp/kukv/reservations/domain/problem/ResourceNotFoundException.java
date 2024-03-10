package jp.kukv.reservations.domain.problem;

/** リソース存在が存在しないエラー */
public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(String message) {
    super(message);
  }
}
