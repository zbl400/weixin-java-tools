package me.chanjar.weixin.cp.bean.messagebuilder;

import me.chanjar.weixin.cp.bean.WxCpMessage;

public class BaseBuilder<T> {
  protected String msgType;
  protected String agentId;
  protected String toUser;
  protected String toParty;
  protected String toTag;
  protected String safe;

  public T agentId(String agentId) {
    this.agentId = agentId;
    return (T) this;
  }

  public T toUser(String toUser) {
    this.toUser = toUser;
    return (T) this;
  }

  public T toParty(String toParty) {
    this.toParty = toParty;
    return (T) this;
  }

  public T toTag(String toTag) {
    this.toTag = toTag;
    return (T) this;
  }

  public T safe(boolean isSafe) {
    this.safe = isSafe ? "1" : "0";
    return (T) this;
  }

  public WxCpMessage build() {
    WxCpMessage m = new WxCpMessage();
    m.setAgentId(this.agentId);
    m.setMsgType(this.msgType);
    m.setToUser(this.toUser);
    m.setToParty(this.toParty);
    m.setToTag(this.toTag);
    m.setSafe(this.safe);
    return m;
  }

}
