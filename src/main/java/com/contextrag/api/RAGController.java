package com.contextrag.api;

import com.contextrag.orchestrator.RAGOrchestrator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rag")
@Tag(name = "RAG", description = "Endpoints for submitting prompts to the RAG pipeline")
public class RAGController {

    private final RAGOrchestrator orchestrator;

    public RAGController(RAGOrchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    @PostMapping("/prompt")
    @Operation(
            summary = "Submit a prompt",
            description = "Publishes a prompt into the RAG orchestration flow.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Prompt accepted for processing")
            }
    )
    public void prompt(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation = PromptRequest.class),
                            examples = @ExampleObject(
                                    name = "prompt",
                                    value = """
                                            {
                                              "prompt": "Summarize the latest onboarding context."
                                            }
                                            """
                            )
                    )
            )
            @RequestBody PromptRequest request
    ) {
        orchestrator.handlePrompt(request.getPrompt());
    }
}
