package movieinfoservice.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CatalogEventSource {

    @Input("movieCatalogIn")
    SubscribableChannel catalogInfoInChannel();
}
