package cn.snowman.chat.net.function;


import cn.snowman.chat.entity.ResultEntity;
import cn.snowman.chat.net.exception.ApiServerException;
import io.reactivex.functions.Function;

/**
 * @author guanghe-code
 * @date on 2018-1-25 11:07
 * @describe 处理服务器返回的结果
 */
public class ServerResultFunction implements Function<ResultEntity, Object> {
    @Override
    public Object apply(ResultEntity resultEntity) throws Exception {
        if (!resultEntity.isSuccess()) {
            throw new ApiServerException(resultEntity.getErrorCode(), resultEntity.getMsg());
        }
        return resultEntity.getBody();
    }
}
