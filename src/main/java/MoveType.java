public enum MoveType {
    COOPERATE("CO"),
    CHEAT("CH");
    private String inputText;

    MoveType(String inputText) {
        this.inputText = inputText;
    }

    public static MoveType valueFor(String inputText) {
        for (MoveType move : MoveType.values())
        {
            // move.inputText == inputText ? return move: return null;
            if(move.inputText.equals(inputText)){
                return move;
            }
        }
        return null;
    }
}
