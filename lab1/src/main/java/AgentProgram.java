public class AgentProgram {

    public Action execute(Percept p) {// location, status
        if (Environment.LocationState.DIRTY.equals(p.getLocationState())) {
            return Environment.SUCK_DIRT;
        }
        if (p.getAgentLocation().equals("A")) {
            return Environment.MOVE_RIGHT;
        }
        if (p.getAgentLocation().equals("B")) {
            return Environment.MOVE_LEFT;
        }
        return NoOpAction.NO_OP;
    }
}