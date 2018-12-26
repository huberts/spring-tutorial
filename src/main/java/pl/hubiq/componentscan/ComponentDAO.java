package pl.hubiq.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

    private final ComponentJdbcConnection componentJdbcConnection;

    @Autowired
    public ComponentDAO(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return componentJdbcConnection;
    }
}
