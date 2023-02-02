package MTSTools.ac.ic.doc.mtstools.model.operations.DCS.nonblocking;

import MTSTools.ac.ic.doc.commons.relations.Pair;
import MTSTools.ac.ic.doc.mtstools.model.operations.DCS.nonblocking.abstraction.HAction;

public interface ExplorationHeuristic<State, Action> {

    void setInitialState(Compostate<State, Action> initial);

    boolean somethingLeftToExplore();

    void expansionDone(Compostate<State, Action> first, HAction<State, Action> second, Compostate<State, Action> child);

    Pair<Compostate<State,Action>, HAction<State,Action>> getNextAction();

    void notifyExpandingState(Compostate<State, Action> state, HAction<State, Action> action, Compostate<State, Action> child);

    void notifyStateIsNone(Compostate<State, Action> state);

    void notifyStateSetErrorOrGoal(Compostate<State, Action> state);

    void newState(Compostate<State, Action> state, Compostate<State, Action> parent);

    void notifyExpansionDidntFindAnything(Compostate<State, Action> parent, HAction<State, Action> action, Compostate<State, Action> child);

    boolean fullyExplored(Compostate<State, Action> state);

    boolean hasUncontrollableUnexplored(Compostate<State, Action> state);

    void initialize(Compostate<State, Action> state);
}
