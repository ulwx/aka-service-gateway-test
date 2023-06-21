package com.example.gateway;

import com.github.ulwx.aka.gateway.filters.TokenInfoBuilder;
import com.github.ulwx.aka.gateway.filters.utils.TokenInfo;
import com.ulwx.tool.ObjectUtils;
import com.ulwx.tool.SnowflakeIdWorker;
import org.springframework.http.server.reactive.ServerHttpRequest;

import java.util.Map;

public class MyTokenBuilder implements TokenInfoBuilder {
    @Override
    public TokenInfo build(ServerHttpRequest request, String responseBody) {
        try {
            Map<String, Object> map = ObjectUtils.fromJsonToMap(responseBody);
            String status=map.get("status")+"";
            if(status.equals("1")){
                Map<String,Object> data=(Map<String,Object> )map.get("data");
                String userId=data.get("userId")+"";
                TokenInfo jwtInfo=new TokenInfo();
                jwtInfo.setUser(userId);
                jwtInfo.setSource("PC");
                jwtInfo.setJwtID(SnowflakeIdWorker.instance.nextId()+"");
                return jwtInfo;

            }
            return null;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
