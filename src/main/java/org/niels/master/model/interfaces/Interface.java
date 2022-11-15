package org.niels.master.model.interfaces;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.niels.master.model.logic.Logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class Interface {
    protected String name;
    protected Type type;
    protected InputType in = InputType.NONE;
    protected OutputType out = OutputType.NONE;
    protected Integer time;
    protected Integer workload;

    protected Set<String> partOfHandling = new HashSet<>();

    protected List<Logic> logic = new ArrayList<>();

    public enum Type {
        @SerializedName("http")
        HTTP,
        @SerializedName("amqp")
        AMQP
    }

    public enum OutputType {
        @SerializedName("none")
        NONE,
        @SerializedName("single")
        SINGLE,
        @SerializedName("list")
        LIST
    }

    public enum InputType {
        @SerializedName("none")
        NONE,
        @SerializedName("single")
        SINGLE,
        @SerializedName("list")
        LIST
    }
}
