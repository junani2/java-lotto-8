package exception;

public enum ErrorMessage {

    INPUT_MIN_AMOUNT_ERROR("[ERROR]구입 금액은 최소 1000원 이상이어야 합니다. "),
    INPUT_AMOUNT_UNIT_ERROR("[ERROR] 금액은 1000원 단위로 입력해야 합니다.");


    private final String message;
    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
