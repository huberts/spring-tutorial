package pl.hubiq.hubspringtut1.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    private final SomeCdiDAO someCdiDAO;

    @Inject
    public SomeCdiBusiness(SomeCdiDAO someCdiDAO) {
        this.someCdiDAO = someCdiDAO;
    }

    public SomeCdiDAO getSomeCdiDAO() {
        return someCdiDAO;
    }
}
