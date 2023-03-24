package movieinfoservice.events.handler;

import movieinfoservice.events.Catalogevent;

public interface CatalogEventHandler {

    public void handleCatalogMovieDetails(Catalogevent catalogevent);
}
