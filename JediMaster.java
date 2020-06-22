
class JediMaster extends Jedi {

    JediMaster(String name) {
        super(name);
    }

    /**
     * Cast a vote on the Jedi Council.
     */
    boolean vote(String issue) {
        if (isAGoodIdea(issue)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isAGoodIdea(String issue) {
        return true;
    }
}
