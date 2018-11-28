package org.web3j.protocol;

import com.alibaba.fastjson.JSONObject;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.Response;
import org.web3j.protocol.websocket.events.Notification;
import org.web3j.utils.Async;
import rx.Observable;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CompletableFuture;

/**
 * Base service implementation.
 */
public abstract class Service implements Web3jService {

    public Service(boolean includeRawResponses) {
    }

    protected abstract InputStream performIO(String payload) throws IOException;

    @Override
    public <T extends Response> T send(
            Request request, Class<T> responseType) throws IOException {

        String payload = JSONObject.toJSONString(request);

        try (InputStream result = performIO(payload)) {
            if (result != null) {
                return JSONObject.parseObject(result, responseType);
            } else {
                return null;
            }
        }
    }

    @Override
    public <T extends Response> CompletableFuture<T> sendAsync(
            Request jsonRpc20Request, Class<T> responseType) {
        return Async.run(() -> send(jsonRpc20Request, responseType));
    }

    @Override
    public <T extends Notification<?>> Observable<T> subscribe(
            Request request,
            String unsubscribeMethod,
            Class<T> responseType) {
        throw new UnsupportedOperationException(
                String.format(
                        "Service %s does not support subscriptions",
                        this.getClass().getSimpleName()));
    }
}
