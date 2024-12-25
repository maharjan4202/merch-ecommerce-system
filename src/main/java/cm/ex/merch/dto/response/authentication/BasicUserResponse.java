package cm.ex.merch.dto.response.authentication;

import cm.ex.merch.dto.response.basic.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class BasicUserResponse extends Response {
    private String type; //create, read, update, delete

    public BasicUserResponse(boolean status, String message, String type) {
        super(status, message);
        this.type = type;
    }

}
