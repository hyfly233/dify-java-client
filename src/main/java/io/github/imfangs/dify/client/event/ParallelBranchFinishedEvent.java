package io.github.imfangs.dify.client.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 并行分支完成事件
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ParallelBranchFinishedEvent extends BaseWorkflowEvent {

    /**
     * 详细内容
     */
    @JsonProperty("data")
    private ParallelBranchFinishedEvent.ParallelBranchFinishedData data;

    @Data
    @NoArgsConstructor
    public static class ParallelBranchFinishedData {

        /**
         * 并行执行 ID
         */
        @JsonProperty("parallel_id")
        private String parallelId;

        /**
         * 并行分支 ID
         */
        @JsonProperty("parallel_branch_id")
        private String parallelBranchId;

        /**
         * 父级并行 ID
         */
        @JsonProperty("parent_parallel_id")
        private String parentParallelId;

        /**
         * 父级并行开始节点 ID
         */
        @JsonProperty("parent_parallel_start_node_id")
        private String parentParallelStartNodeId;

        /**
         * 迭代器 ID
         */
        @JsonProperty("iteration_id")
        private String iterationId;

        /**
         * 循环 ID
         */
        @JsonProperty("loop_id")
        private String loopId;

        /**
         * 状态
         */
        @JsonProperty("status")
        private String status;

        /**
         * 错误信息
         */
        @JsonProperty("error")
        private String error;

        /**
         * 创建时间
         */
        @JsonProperty("created_at")
        private Long createdAt;
    }
}
