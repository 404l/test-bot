package com.starnovskiy.testbot.model;

import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
@Builder
public class Message implements Serializable {
    @SerializedName(value = "user_id")
    Long userId;
    @SerializedName(value = "random_id")
    Long randomId;
    @SerializedName(value = "peer_id")
    Long peerId;
    @SerializedName(value = "peer_ids")
    String peerIds;
    String domain;
    @SerializedName(value = "chat_id")
    Long chatId;
    @SerializedName(value = "user_ids")
    String userIds;
    @SerializedName(value = "message")
    String text;
    Long guid;
    String lat;
    @SerializedName(value = "long")
    String longField;
    String attachment;
    @SerializedName(value = "reply_to")
    Long replyTo;
    @SerializedName(value = "forward_messages")
    String forwardMessages;
    String forward;
    @SerializedName(value = "sticker_id")
    Long stickerId;
    @SerializedName(value = "group_id")
    Long groupId;
    String keyboard;
    String template;
    String payload;
    @SerializedName(value = "content_source")
    String contentSource;
    @SerializedName(value = "dont_parse_links")
    Integer dontParseLinks;
    @SerializedName(value = "disable_mentions")
    Integer disableMentions;
    String intent;
    @SerializedName(value = "subscribe_id")
    Long subscribeId;
}
