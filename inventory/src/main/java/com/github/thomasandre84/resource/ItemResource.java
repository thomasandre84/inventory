package com.github.thomasandre84.resource;

import com.github.thomasandre84.service.ItemService;
import io.smallrye.mutiny.Uni;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Slf4j
@RequiredArgsConstructor
@Path(ItemResource.BASE_URL)
public class ItemResource {
    static final String BASE_URL = "/api/items";

    private final ItemService itemService;

    @GET
    public Uni<Response> getItems() {
        log.info("Get items");
        return Uni.createFrom()
                .item(Response.ok().build());
    }
}
