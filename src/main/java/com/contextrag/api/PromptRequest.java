package com.contextrag.api;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Prompt payload submitted to the RAG pipeline")
public class PromptRequest {

    @Schema(
            description = "Natural language prompt to process",
            example = "Summarize the context for tenant onboarding."
    )
    private String prompt;

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
