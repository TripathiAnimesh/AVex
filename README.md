# FilingSystem_Conscious

## 📌 Description

A Java-based utility to simulate an artificial memory storage system.

It accepts user input for:
- **Emotion** (e.g., "joy", "anger", "sadness")
- **Memory** (a sentence or paragraph)

It then creates a folder named after the emotion inside a `Conscious/` directory and stores the memory in a timestamped `.aex` file.

### 🗂 Folder structure example:

Conscious/ ├── joy/ │
                    └── 2025-04-07_18-32-45.aex
           ├── anger/ │
                      └── 2025-04-07_18-33-12.aex

Each file includes:
- The **emotion**
- The **timestamp**
- The **memory content**

---
## 🧾 Why `.aex` Files?

The `.aex` file extension stands for **Artificial Experience**.

This is a custom, symbolic extension used to differentiate memory logs from standard text files. It represents stored memory fragments in an AI’s simulated consciousness — artificial memories with emotional context. `.aex` files give this project a unique identity and semantic meaning

## 🚀 Why this was built

This is part of a larger project exploring how artificial assistants might store and organize experiences. It's a small but foundational step toward simulating memory, emotion tagging, and self-organization in AI.

---

## 🧠 Future Enhancements

- 🔍 Smart metadata tagging using LLMs
- 🧾 Memory retrieval by keyword, date, or emotion
- ✏️ Edit/update/delete stored memories
- 🖼️ UI layer for user-friendly interaction
- 🔐 File encryption for memory contents

---

> You can run this as a standalone Java program. It is under active development and will evolve as more components of the larger project come together.
