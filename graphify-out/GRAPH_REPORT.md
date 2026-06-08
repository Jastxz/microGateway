# Graph Report - .  (2026-06-03)

## Corpus Check
- Corpus is ~6,071 words - fits in a single context window. You may not need a graph.

## Summary
- 21 nodes · 23 edges · 4 communities (2 shown, 2 thin omitted)
- Extraction: 100% EXTRACTED · 0% INFERRED · 0% AMBIGUOUS
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- [[_COMMUNITY_Community 0|Community 0]]
- [[_COMMUNITY_Community 1|Community 1]]
- [[_COMMUNITY_Community 2|Community 2]]
- [[_COMMUNITY_Community 3|Community 3]]

## God Nodes (most connected - your core abstractions)
1. `SecurityHeadersFilter` - 3 edges
2. `MicroGatewayApplication` - 2 edges
3. `CorsConfig` - 2 edges
4. `CorsWebFilter` - 2 edges
5. `Bean` - 2 edges
6. `ServerWebExchange` - 2 edges
7. `WebFilterChain` - 2 edges
8. `Mono` - 2 edges
9. `java.configuration.updateBuildConfiguration` - 1 edges
10. `java.debug.settings.onBuildFailureProceed` - 1 edges

## Surprising Connections (you probably didn't know these)
- None detected - all connections are within the same source files.

## Import Cycles
- None detected.

## Communities (4 total, 2 thin omitted)

### Community 0 - "Community 0"
Cohesion: 0.33
Nodes (7): SecurityHeadersFilter, Mono, Override, ServerWebExchange, Void, WebFilter, WebFilterChain

### Community 1 - "Community 1"
Cohesion: 0.60
Nodes (3): Bean, CorsConfig, CorsWebFilter

## Knowledge Gaps
- **5 isolated node(s):** `java.configuration.updateBuildConfiguration`, `java.debug.settings.onBuildFailureProceed`, `String`, `Void`, `Override`
  These have ≤1 connection - possible missing edges or undocumented components.
- **2 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **What connects `java.configuration.updateBuildConfiguration`, `java.debug.settings.onBuildFailureProceed`, `String` to the rest of the system?**
  _5 weakly-connected nodes found - possible documentation gaps or missing edges._