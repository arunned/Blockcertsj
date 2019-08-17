package com.nbouma.jsonldjava.core;


import java.net.URL;

//import org.apache.http.impl.client.CloseableHttpClient;

import com.nbouma.jsonldjava.utils.JsonUtils;
/**
 * Created by noah on 09/04/17.
 */

public class DocumentLoader {

    /**
     * Identifies a system property that can be set to "true" in order to
     * disallow remote context loading.
     */
    public static final String DISALLOW_REMOTE_CONTEXT_LOADING = "com.github.jsonldjava.disallowRemoteContextLoading";

    public RemoteDocument loadDocument(String url) throws JsonLdError {
        final String disallowRemote = System
                .getProperty(DocumentLoader.DISALLOW_REMOTE_CONTEXT_LOADING);

        if ("true".equalsIgnoreCase(disallowRemote)) {
            throw new JsonLdError(JsonLdError.Error.LOADING_REMOTE_CONTEXT_FAILED, "Remote context loading has been disallowed (url was " + url + ")");
        }

        final RemoteDocument doc = new RemoteDocument(url, null);
        try {
            doc.setDocument(JsonUtils.fromURL(new URL(url)/*, getHttpClient()*/));
        } catch (final Exception e) {
            throw new JsonLdError(JsonLdError.Error.LOADING_REMOTE_CONTEXT_FAILED, url, e);
        }
        return doc;
    }

    /**
     * An HTTP Accept header that prefers JSONLD.
     *
     * @deprecated Use {@link JsonUtils#ACCEPT_HEADER} instead.
     */
    @Deprecated
    public static final String ACCEPT_HEADER = JsonUtils.ACCEPT_HEADER;

    //private volatile CloseableHttpClient httpClient;

/*    public CloseableHttpClient getHttpClient() {
        CloseableHttpClient result = httpClient;
        if (result == null) {
            synchronized (DocumentLoader.class) {
                result = httpClient;
                if (result == null) {
                    result = httpClient = JsonUtils.getDefaultHttpClient();
                }
            }
        }
        return result;
    }

    public void setHttpClient(CloseableHttpClient nextHttpClient) {
        httpClient = nextHttpClient;
    }*/
}