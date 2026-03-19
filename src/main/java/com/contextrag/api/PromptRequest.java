package com.contextrag.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents the request body used to submit a prompt to the API.
 */
@Getter
@Setter
@NoArgsConstructor
@Schema(description = "Prompt payload submitted to the RAG pipeline")
public class PromptRequest {

    @Schema(
            description = "Natural language prompt to process",
            example = "Summarize the context for tenant onboarding."
    )
    private String prompt;
}
