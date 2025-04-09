# Emotional Memory System – Conscious Layer

## Project Overview

**Emotional Memory** is a foundational module in a broader, privacy-first, AI-driven **Simulated Consciousness System**. The overarching goal is to explore how an artificial assistant might encode experiences, emotional context, and situational memory — similar to human cognition.

This module, `FilingSystem_Conscious`, simulates the **Conscious Layer**, which is responsible for storing emotionally-tagged short-term memories in a structured format. Each memory is stored with a timestamp and emotion category in a custom `.aex` format (**Artificial Experience**).

> This is the first of many components aimed at building an intelligent system with persistent memory, contextual awareness, and emotion modeling.

---

## Features

- Accepts user input:
  - **Emotion** (e.g., `joy`, `anger`, `sadness`)
  - **Memory** (a sentence or paragraph)
- Stores the memory in a timestamped `.aex` file inside:
  - `Conscious/{emotion}/` directory
- Each `.aex` file contains:
  - Emotion
  - Timestamp
  - Memory content

---

## Example Folder Structure

Conscious/
          ├── joy/ │
                   └── 2025-04-07_18-32-45.aex
          ├── anger/ │
                     └── 2025-04-07_18-33-12.aex


---

## About `.aex` Files

`.aex` stands for **Artificial Experience** — a custom file extension that distinguishes memory fragments from traditional logs or text files. It symbolizes emotionally-contextualized data stored within an artificial memory system.

---

## Why This Was Built

This utility is part of a larger experimental AI system aimed at:

- Simulating **episodic memory formation**
- Creating **emotion-tagged experiences**
- Enabling **personalized memory-based reasoning**
- Modeling **human-like consciousness layers** in AI

This particular module is focused on *memory encoding and storage* — the foundation for future memory retrieval, editing, analysis, and behavioral synthesis.

---

## Future Enhancements

| Feature                            | Status      | Notes                                      |
|------------------------------------|-------------|--------------------------------------------|
| Emotion-tagged memory storage      | ✅ In place | Saves `.aex` files in emotion-based folders|
| Search & retrieval system          | ⏳ Planned  | By date, keyword, or emotion               |
| File encryption                    | ⏳ Planned  | To secure memory contents                  |
| UI layer                           | ⏳ Planned  | Graphical interface for easier interaction |
| Smart metadata tagging (LLM)       | ⏳ Planned  | Auto-classify and analyze memory content   |
| Subconscious & Sentinel layers     | ⏳ Planned  | For deep memory simulation and privacy     |

---

## Long-Term Vision

The final system aims to simulate an AI agent that:

- Forms long-term contextual memories
- Remembers emotional context
- Evolves behavior over time
- Maintains introspective logs
- Protects user data with encryption and consent layers

This is just the **Conscious Layer** — the topmost part of a multi-layer memory framework.

---

## Status

> 🚧 **Active Development**  
> Contributions, feedback, and forks are welcome. This is a research-aligned project focused on exploring emotional memory simulation in artificial agents.

---

## Author

**Animesh Tripathi** 

