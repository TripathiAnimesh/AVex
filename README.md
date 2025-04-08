# 🧠 Extended Emotional Memory System for LLMs

This project is designed to simulate persistent emotional memory for AI models — enabling them to better understand, recall, and respond based on a user's past emotions and context. It creates encrypted emotion-specific files to store inputs over time, paving the way toward emotionally intelligent, memory-augmented AI.

> “Because sometimes, AI should remember not just what you said, but how you felt.”
---

## 🛠️ Tech Stack

### Core Tech (Phase 1 - Current Stage)
- Java (Core + I/O)
- CLI interface
- Custom file system (.aem files)

### Planned Integrations
- Java Spring Boot (backend APIs)
- Encrypted memory storage (AES or RSA-based custom logic)
- Local LLM support (Mistral, LLaMA.cpp, Ollama)
- Cloud sync via Gmail/Google Drive (using OAuth)
- GUI (JavaFX or Web-based with React)
- LLM interaction API layer (OpenAI, Local, or Ollama endpoints)
- GitHub Actions (CI/CD)

---

## 📌 Why This Exists

Modern LLMs have immense potential but lack emotional continuity. They forget — even when you don’t want them to. This project:

- Bridges that emotional memory gap
- Builds personalized, persistent emotional memory
- Works offline + encrypts everything locally
- Gives you ownership over your data

Imagine talking to an AI that *remembers how you felt last winter* — and gently tailors its response accordingly.

---

## 📅 Roadmap

### ✅ Phase 1: Foundation (Basic CLI Java)
-  CLI input for user emotion and memory
-  Custom `.aem` file creation
-  Folder structure per emotion

### 🔐 Phase 2: Security + Structure
-   Implement custom encrypted format
-  Add basic JSON or binary serialization

### ☁️ Phase 3: Sync + API
-  Cloud sync via Google Drive API
-  Java Spring Boot REST API
-  Authentication layer

### 🤖 Phase 4: LLM Integration
-  Connect to local LLM (via API)
-  Emotion-based prompt injection
-  Basic response generation from past memory

### 🖼️ Phase 5: GUI & Visualization
-  Lightweight desktop GUI
-  Timeline view of emotional memories
-  Search + tag system

### 🚀 Bonus
-  Custom file extension handler for `.aem`
-  Native launcher/bundler
-  Decentralized memory (IPFS/Filecoin - research phase)

---

## 📖 How to Use

1. Clone this repo
2. Run the CLI Java program
3. Enter an emotion when prompted (e.g., “stressed”)
4. Type your memory
5. It gets saved under `/memories/stressed/YYYY-MM-DD.aem`

---

## 📦 Custom File Type: `.aem`

The `.aem` (Animesh Emotion Memory) format is a custom memory file structure designed to:

- Hold encrypted or serialized emotional memory
- Avoid standard file parsers to ensure privacy
- Work only within this system unless decrypted manually

---

## 🔐 Data Privacy + Vision

We envision encrypted-by-default memory agents where:

- Only you can access or pass your memory to an AI
- No central servers store anything unless user-approved
- Future families can pass down personalized AIs like journals

We plan to make this model **offline-compatible**, **LLM-neutral**, and fully **user-owned**.

---

## 🧑‍🚀 Future Plans

- Native mobile app (with local-only sync)
- AI self-hosting platform
- Emotional journaling and timeline heatmap
- File format export (.pdf/.json/.aem viewer)
- Plugin system for therapy/mood-tracking/goal-setting

---

## ⚠️ Disclaimer

This is an early-stage personal memory architecture. It is not yet production-ready and should not be used for sensitive personal data until encryption and sync layers are complete.

---

## 🧠 Inspiration

- Linus Torvalds (for caring deeply about systems)
- OpenAI, Claude, Gemini (for forgetting things too fast)
- “Dear Diary” apps that deserved better security
- People who journal, people who forget, and people who feel too much

---

## 👤 Author

**Animesh** .  — Computer Science undergrad, Privacy advocate , and passionate about building human-centric, ethical AI systems.

> Feel free to star 🌟 the repo if you like the idea. Contributions and suggestions welcome!






