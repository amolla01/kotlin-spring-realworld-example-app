package io.realworld.model.inout

import com.fasterxml.jackson.annotation.JsonRootName
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@JsonRootName("user")
class Login {
    @NotNull(message = "can't be missing")
    @Size(min = 1, message = "can't be empty")
    var email: String? = ""

    @NotNull(message = "can't be missing")
    @Size(min = 1, message = "can't be empty")
    var password: String? = ""

    constructor(email: String?, password: String?) {
        this.email = email
        this.password = password
    }
}