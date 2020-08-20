package io.github.cmt.extension.consumer.service;

import io.github.cmt.extension.common.annotation.Extension;
import io.github.cmt.extension.common.ExtensionTypeEnum;
import io.github.cmt.extension.spi.IHelloService;

/**
 * @author shengchaojie
 * @date 2019-10-25
 **/
@Extension(bizCode = "f",invokeMethod = ExtensionTypeEnum.LOCAL)
public class LocalHelloServiceImpl2 implements IHelloService {
    public String hello() {
        return "helloF";
    }
}
