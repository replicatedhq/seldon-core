package io.seldon.clustermanager.k8s.client;

import java.io.IOException;

import org.springframework.stereotype.Component;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ProtoClient;
import io.kubernetes.client.util.Config;

@Component
public class K8sDefaultClientProvider implements K8sClientProvider {

	@Override
	public ApiClient getClient() throws IOException {
		return Config.defaultClient();
	}

	@Override
	public ProtoClient getProtoClient() throws IOException {
		return new ProtoClient(Config.defaultClient());
	}

}