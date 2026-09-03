# Tech Backlog

## Async Event Handling With Bounded Executor

### Status

Planned

### Context

The current service uses in-process Spring application events as part of an event-driven monolith design. This keeps the flow simple and decoupled without introducing an external broker.

### Problem

The current event handling flow is synchronous. If listener processing time grows faster than incoming request volume, request threads can become blocked and overall throughput can degrade.

### Proposed Approach

Introduce asynchronous event handling backed by a bounded Spring `TaskExecutor`.

Suggested direction:

- use `@Async` for event listener execution
- configure a bounded executor with explicit queue capacity
- define a rejection policy appropriate for the service
- add basic logging or metrics around event processing latency and queue pressure

### Why Not A Queue Yet

An external queue is not the immediate next step for this project. The current architecture is intentionally an event-driven monolith. A broker should only be introduced if durability, independent consumer scaling, or cross-process delivery becomes a real requirement.

### Triggers To Prioritize

- listener processing becomes noticeably slower
- request latency increases due to event handling
- throughput grows beyond what synchronous in-process dispatch can handle
- operational need emerges for retries or better backpressure control

### Acceptance Criteria

- event listeners execute asynchronously
- executor configuration is bounded and explicit
- queue capacity and rejection behavior are documented
- correlation and timing logs or metrics are available for event processing
- no external broker is introduced as part of this change

### Origin

Captured from review discussion on PR `#3` about whether the monolith should use a queue or stay with in-process events for now.
