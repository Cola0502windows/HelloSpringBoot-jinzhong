package cola.springboot.hellospringbootjinzhong.common.generator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 代表生成的实体类中的一个字段
 */
@Data
@AllArgsConstructor
public class ColaField {
    private String name;
    private ColaFieldType type;
    private String comment;
}
