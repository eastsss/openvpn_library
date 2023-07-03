package de.blinkt.openvpn;

public interface OnVPNStatusChangeListener {
    void onVPNEventReceived(String event);

    void onConnectionInfoChanged(long byteIn, long byteOut);
}
