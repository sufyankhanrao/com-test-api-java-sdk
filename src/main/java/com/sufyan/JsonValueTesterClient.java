/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.sufyan;

import com.sufyan.controllers.DefaultJsonObjController;
import com.sufyan.controllers.DefaultJsonValController;
import com.sufyan.controllers.JsonObjController;
import com.sufyan.controllers.JsonValController;
import com.sufyan.http.client.HttpCallback;
import com.sufyan.http.client.HttpClientConfiguration;
import com.sufyan.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class JsonValueTesterClient implements JsonValueTesterClientInterface {

    /**
     * Private store for controllers.
     */
    private JsonObjController jsonObj;
    private JsonValController jsonVal;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private JsonValueTesterClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .callback(httpCallback)
                .build();
        jsonObj = new DefaultJsonObjController(globalConfig);
        jsonVal = new DefaultJsonValController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of JsonObjController.
     * @return jsonObj
     */
    public JsonObjController getJsonObjController() {
        return jsonObj;
    }

    /**
     * Get the instance of JsonValController.
     * @return jsonVal
     */
    public JsonValController getJsonValController() {
        return jsonVal;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "http://apimatic.hopto.org";
            }
            if (server.equals(Server.AUTH_SERVER)) {
                return "http://apimaticauth.hopto.org:3000";
            }
        }
        if (environment.equals(Environment.TESTING)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "http://localhost:3000";
            }
            if (server.equals(Server.AUTH_SERVER)) {
                return "http://apimaticauth.xhopto.org:3000";
            }
        }
        return "http://localhost:3000";
    }

    /**
     * Converts this JsonValueTesterClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "JsonValueTesterClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + "]";
    }

    /**
     * Builds a new {@link JsonValueTesterClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link JsonValueTesterClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link JsonValueTesterClient}.
     */
    public static class Builder {

        private Environment environment = Environment.TESTING;
        private HttpClient httpClient;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new JsonValueTesterClient object using the set fields.
         * @return JsonValueTesterClient
         */
        public JsonValueTesterClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new JsonValueTesterClient(environment, httpClient, httpClientConfig,
                    httpCallback);
        }
    }
}