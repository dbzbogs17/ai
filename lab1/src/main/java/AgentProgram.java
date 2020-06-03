public class AgentProgram {

    public Action execute(Percept p) {// location, status
        if (Environment.LocationState.DIRTY.equals(p.getLocationState())) {
            return Environment.SUCK_DIRT;
        }
        if ("A".equals(p.getAgentLocation())) {
            return Environment.MOVE_RIGHT;
        }
        if ("B".equals(p.getAgentLocation())) {
            return Environment.MOVE_LEFT;
        }
        return NoOpAction.NO_OP;
    }
}