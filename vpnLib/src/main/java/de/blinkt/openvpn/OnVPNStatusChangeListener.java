package de.blinkt.openvpn;

public interface OnVPNStatusChangeListener {
    void onVPNStateChanged(String state);

    void onConnectionInfoChanged(long byteIn, long byteOut);
}
