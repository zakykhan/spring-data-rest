# spring-data-rest

Spring Data REST is part of the umbrella Spring Data project and makes it easy to build hypermedia-driven REST web services on top of Spring Data repositories.

Spring Data REST builds on top of Spring Data repositories, analyzes your application’s domain model and exposes hypermedia-driven HTTP resources for aggregates contained in the model.

Features:-

1) Exposes a discoverable REST API for your domain model using HAL as media type.

2) Exposes collection, item and association resources representing your model.

3) Supports pagination via navigational links.

4) Allows to dynamically filter collection resources.

5) Exposes dedicated search resources for query methods defined in your repositories.

6) Allows to hook into the handling of REST requests by handling Spring ApplicationEvents.

7) Exposes metadata about the model discovered as ALPS and JSON Schema.

8) Allows to define client specific representations through projections.

9) Ships a customized variant of the HAL Explorer to leverage the exposed metadata.

11) Currently supports JPA, MongoDB, Neo4j, Solr, Cassandra, Gemfire.

12) Allows advanced customizations of the default resources exposed.
