package de.danoeh.antennapod.net.ssl;

import okhttp3.OkHttpClient;

import javax.net.ssl.X509TrustManager;

public class SslClientSetup {
    public static void installCertificates(OkHttpClient.Builder builder) {
        if (BuildConfig.FLAVOR.equals("free")) {
            // The Free flavor bundles a modern conscrypt (security provider), so CustomSslSocketFactory
            // is only used to make sure that modern protocols (TLSv1.3 and TLSv1.2) are enabled and
            // that old, deprecated, protocols (like SSLv3, TLSv1.0 and TLSv1.1) are disabled.
            X509TrustManager trustManager = BackportTrustManager.create();
            builder.sslSocketFactory(new NoV1SslSocketFactory(trustManager), trustManager);
        }
    }
}
