package com.starnovskiy.testbot.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ResponseSendMessage {

    @SerializedName(value = "peer_id")
    Long peerId;
    @SerializedName(value = "message_id")
    Long messageId;
    ResponseSendError error;

    @Getter
    public static class ResponseSendError {
        @SerializedName(value = "error_code")
        Long errorCode;
        @SerializedName(value = "error_msg")
        String errorMsg;
    }

}
