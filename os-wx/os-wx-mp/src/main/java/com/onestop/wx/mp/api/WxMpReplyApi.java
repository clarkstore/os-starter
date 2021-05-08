package com.onestop.wx.mp.api;

import com.onestop.common.core.exception.OsBizException;
import com.onestop.common.core.util.Res;
import com.onestop.wx.mp.model.dto.ReplyConfigs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 微信服务号关键字回复接口
 *
 * @author Clark
 * @version 2021-04-29
 */
@Slf4j
@RestController
@RequestMapping("${os.wxmp.apiPath}/reply")
public class WxMpReplyApi {
    @Autowired(required = false)
    private ReplyConfigs replyConfigs;

    @PostMapping("/update")
    public Res update(@RequestBody Map<String, String> replyTextMap) {
        try {
            this.replyConfigs.setReplyTextMap(replyTextMap);
            return Res.ok("关键字回复列表已更新");
        } catch (OsBizException e) {
            return Res.failed(e.getMsg());
        } catch (NullPointerException e) {
            return Res.failed("配置项：os.wxmp.reply.enabled 未设置");
        }
    }
}
