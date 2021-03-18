package com.onestop.wx.mp.handler;

import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.MenuButtonType;

/**
 * 菜单事件处理类
 *
 * @author Clark
 * @date 2020-08-08
 */
@Component
public class MpMenuHandler extends MpBaseHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService wxMpService,
                                    WxSessionManager sessionManager) {

        if (MenuButtonType.VIEW.equalsIgnoreCase(wxMessage.getEvent())) {
            return null;
        }

        if (MenuButtonType.CLICK.equalsIgnoreCase(wxMessage.getEvent())) {
//            String eventKey = wxMessage.getEventKey();
//            if (StrUtil.startWithAny(eventKey, WechatConsts.MenuKey.KfService)) {
//                // 接入多客服
//                return super.transferKfService(wxMessage);
//            } else if (StrUtil.startWithAny(eventKey, WechatConsts.MenuKey.Reply)) {
//                String keyword = wxMessage.getEventKey();
//                // 只保留关键字部分
//                wxMessage.setContent(keyword.replaceAll(WechatConsts.MenuKey.Reply, ""));
//                // 关键字回复
//                return super.buildReply(wxMessage);
//            }
        }

        return null;
    }
}
