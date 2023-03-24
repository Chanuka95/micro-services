package moviecatalogservice.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MovieCatalogEventNotification {

    @Output("movieCatalogOut")
    MessageChannel movieCatalogOut();

}
