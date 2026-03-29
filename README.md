# Historical F1 Champions Explorer

A Java console application for exploring Formula 1 World Champions (1950–2024) using custom data structures and Gemini AI integration.

## Features

- **List all champions** chronologically via Linked List
- **Search by year or nationality** using Binary Search Tree (O(log n))
- **Compare drivers** by wins and points
- **BST-sorted output** by year
- **AI-powered queries** via Gemini API ("How many titles did Schumacher win?")

## Data Structures

| Structure | Usage |
|-----------|-------|
| Linked List | Chronological champion timeline |
| Binary Search Tree (BST) | Search by nationality & team (O(log n)) |

## Architecture
```
F1ExplorerApp
├── LinkedList<Champion>       → timeline
├── BST<String, Champion>      → nationalityTree
├── BST<String, Champion>      → teamTree
└── GeminiAIService            → AI queries
```

## Classes

- `Champion` — data model (year, name, nationality, team, wins, podiums)
- `ChampionBTree` — BST implementation for attribute-based search
- `ChampionsNode` — Linked List node structure
- `ChampionManager` — business logic
- `ChampionDataReader` — data loading
- `GeminiAIService` — Gemini AI API integration

## How to Run
```bash
# Clone the repo
git clone https://github.com/zeynepkizilkaya/historical-f1-champions-explorer

# Open in your IDE (Eclipse/IntelliJ)
# Run Main.java
```

## Menu Options
```
1. List all champions
2. Find champion by year
3. Find champions by nationality
4. Compare champions by wins
5. List champions sorted by year (BST)
6. Ask Gemini (AI Chat about F1)
0. Exit
```

## Tech Stack

- Java (OOP, Collections)
- Custom Linked List & BST (no external libraries)
- Gemini AI API
- Eclipse IDE

## Course

SEN2212 — Data Structures and Algorithms II
Bahçeşehir University, 2025
