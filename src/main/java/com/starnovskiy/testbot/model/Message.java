package com.starnovskiy.testbot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    @JsonProperty(value = "user_id")
    Long userId;
    @JsonProperty(value = "random_id")
    Long randomId;
    @JsonProperty(value = "peer_id")
    Long peerId;
    @JsonProperty(value = "peer_ids")
    String peerIds;
    @JsonProperty(value = "domain")
    String domain;
    @JsonProperty(value = "chat_id")
    Long chatId;
    @JsonProperty(value = "user_ids")
    String userIds;
    @JsonProperty(value = "message")
    String text;
    @JsonProperty(value = "guid")
    Long guid;
    @JsonProperty(value = "lat")
    String lat;
    @JsonProperty(value = "long")
    String longField;
    @JsonProperty(value = "attachment")
    String attachment;
    @JsonProperty(value = "reply_to")
    Long replyTo;
    @JsonProperty(value = "forward_messages")
    String forwardMessages;
    @JsonProperty(value = "forward")
    String forward;
    @JsonProperty(value = "sticker_id")
    Long stickerId;
    @JsonProperty(value = "group_id")
    Long groupId;
    @JsonProperty(value = "keyboard")
    String keyboard;
    @JsonProperty(value = "template")
    String template;
    @JsonProperty(value = "payload")
    String payload;
    @JsonProperty(value = "content_source")
    String contentSource;
    @JsonProperty(value = "dont_parse_links")
    Integer dontParseLinks;
    @JsonProperty(value = "disable_mentions")
    Integer disableMentions;
    @JsonProperty(value = "intent")
    String intent;
    @JsonProperty(value = "subscribe_id")
    Long subscribeId;
}
