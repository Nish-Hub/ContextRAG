package com.contextrag.api;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents the request body used to submit a prompt to the API.
 */
@Schema(description = "Prompt payload submitted to the RAG pipeline")
public class PromptRequest {

    @Schema(
            description = "Natural language prompt to process",
            example = "Summarize the context for tenant onboarding."
    )
    private String prompt;

    /**
     * Returns the prompt text supplied by the caller.
     *
     * @return prompt text to process
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Updates the prompt text supplied by the caller.
     *
     * @param prompt prompt text to process
     */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
