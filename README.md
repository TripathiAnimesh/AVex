# Emotion-Aware Memory Extension (EAM)

A local file-based extended memory system for LLMs and AI agents, designed to store and retrieve user memories categorized by emotion.

> “Because sometimes, AI should remember not just what you said, but how you felt.”

---

## Project Goal

This is the first building block for a long-term memory system that stores personal data based on the emotional state of the user. The ultimate aim is to use this memory to deliver **context-aware, sentiment-sensitive** responses from LLMs or other intelligent systems.

---

## What It Does (Day 1 MVP)

- Takes user input: an **emotion** and a **text memory**
- Creates or updates a `.aem` file corresponding to that emotion
- Appends timestamped entries to the file
- Uses a **custom file extension** (`.aem`) to separate these emotion logs from other data
- Optional: Adds a header like `AEMv1` to identify valid files

---

## Example

If a user inputs:

Emotion: anxious

Memory: I’m not sure I’m good enough for this project.

what the current version does:
I want the sentiment analysis to be done sentiment analyser in the future currently the sentiments are being inputed by the user itself.

A file called `anxious.aem` is created with:

" AEMv1 [2025-04-07 10:32] I’m not sure I’m good enough for this project. "


---

## 🛠️ Tech Stack

- Java (Core)
- CLI Interface
- Future Plans:
  - JSON or binary structured memory format
  - Encryption
  - Java Spring backend
  - Local LLM integration
  - Cloud sync (Gmail/Drive) {might use a dataBase, if the gmail api is too slow.}
  - LLM memory agent API

---

## 📌 Why This Exists

While modern LLMs are powerful, their **lack of persistent memory** limits long-term personalization. This project aims to give AI the ability to grow with the user, emotionally and contextually — like a therapist with a notebook, only encrypted and immortal.

---

## 📅 Roadmap

-  Basic CLI program to store `.aem` files
-  Read/parse emotion memories
-  Secure with custom encryption
-  Sync to Gmail/Drive cloud
-  Hook to local LLM
-  Build a lightweight GUI or API

---

## 📖 How to Use

1. Run the Java program
2. Enter an emotion when prompted
3. Type a short memory
4. Done! Your `.aem` file will be updated in the project folder

---

## ⚠️ Disclaimer

This is a **work-in-progress**. The goal is ambitious: a lifelong digital memory tied to how we feel. It's not production-grade yet, but it's the start of something meaningful.

---

##  Inspiration

- Linus Torvalds (for caring deeply about systems)
- GPT, Claude, Gemini (for forgetting things too fast)
- Anyone who ever said, “I wish I could remember how I felt back then…”
- For those yet to come.

---

##  Author

**Animesh** – Student, builder, and explorer of machines with feelings.




