package com.miempresa.services;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.iam.v3.region.IamRegion;
import com.huaweicloud.sdk.iam.v3.IamClient;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectsResponse;

import org.springframework.stereotype.Service;

@Service
public class HuaweiCloudService {

    public String obtenerProyectos() {
        BasicCredentials auth = new BasicCredentials()
            .withAk(System.getenv("HUAWEICLOUD_SDK_AK"))
            .withSk(System.getenv("HUAWEICLOUD_SDK_SK"));

        IamClient client = IamClient.newBuilder()
            .withCredential(auth)
            .withRegion(IamRegion.CN_NORTH_4)
            .build();

        KeystoneListProjectsRequest request = new KeystoneListProjectsRequest();
        KeystoneListProjectsResponse response = client.keystoneListProjects(request);

        return response.toString();
    }
}
