# Project Progress

## Overview

This project is a minimal Spring Boot 3.2 service for a ContextRAG workflow.
Current implementation includes a REST endpoint, an orchestrator service, an event class, and an LLM listener.

## Current Status

Status: In progress
Phase: Foundation setup

## Completed

- Bootstrapped Spring Boot application entrypoint
- Added REST endpoint for prompt submission at `POST /rag/prompt`
- Added orchestration flow using Spring application events
- Added LLM listener stub for downstream prompt handling
- Added Swagger/OpenAPI support with Springdoc
- Added OpenAPI metadata and endpoint documentation
- Changed prompt submission payload from raw string to JSON object

## In Scope Next

- Verify the project builds successfully in a local Maven environment
- Start the application and validate Swagger UI at `/swagger-ui/index.html`
- Validate OpenAPI spec output at `/v3/api-docs`
- Add request validation for prompt payloads
- Return a structured API response instead of `void`
- Add tests for controller and orchestrator behavior

## Open Gaps

- No Maven wrapper (`mvnw`) is present
- `mvn` is not available in the current execution environment, so build verification is pending
- No automated tests are present yet
- The LLM integration is still a placeholder implementation
- No persistence, retrieval, or vector store integration exists yet
- No error handling or input validation is implemented yet

## API Snapshot

- `POST /rag/prompt`
  - Request body:
    ```json
    {
      "prompt": "Summarize the latest onboarding context."
    }
    ```
  - Current behavior: accepts the prompt and publishes an internal event

## Suggested Milestones

1. Baseline API stabilization
2. Input validation and structured responses
3. Test coverage for API and orchestration flow
4. Real retrieval and LLM integration
5. Observability, error handling, and production hardening

## Update Notes

- Last updated: 2026-03-19
- Latest completed change: Swagger/OpenAPI integration added
