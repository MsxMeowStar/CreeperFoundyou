# CreeperFoundyou

## 简介 (Introduction)
这是一个PurpurMC服务端插件，主要增强了爬行者的寻路算法，现在爬行者可以从更远的距离发现并奔向玩家

This is a Minecraft plugin designed for PurpurMC servers that enhances the creeper's pathfinding algorithm. Now, creepers can detect players from a greater distance and actively pursue them.

## 功能 (Features)
*   **增强的寻路 (Enhanced Pathfinding)**: 爬行者会主动寻找并追逐附近的玩家
    Creepers will actively seek out and pursue nearby players.
*   **更远的感知范围 (Increased Detection Range)**: 爬行者能够从更远的距离感知到玩家
    Creepers can detect players from a greater distance.
*   **持续追踪 (Persistent Tracking)**: 爬行者会持续追踪最近的在线玩家
    Creepers will continuously track the closest online player.

## 安装 (Installation)

### 前提条件 (Prerequisites)
*   一个运行PurpurMC服务器的实例 (An instance of a PurpurMC server running)
*   Java 21 或更高版本 (Java 21 or higher)
*   Maven (用于构建插件) (Maven for building the plugin)

### 步骤 (Steps)
1.  **下载插件 (Download the Plugin)**:
    从 [GitHub Releases](https://github.com/MsxMeowStar/CreeperFoundyou/releases) 下载最新版本的 `mscreeperseeu.jar` 文件
    Download the latest `mscreeperseeu.jar` file from [GitHub Releases](https://github.com/MsxMeowStar/CreeperFoundyou/releases).

2.  **放置插件 (Place the Plugin)**:
    将下载的 `.jar` 文件放入你的PurpurMC服务器的 `plugins/` 文件夹中
    Place the downloaded `.jar` file into your PurpurMC server's `plugins/` folder.

3.  **重启服务器 (Restart the Server)**:
    重启你的PurpurMC服务器以加载插件
    Restart your PurpurMC server to load the plugin.

## 使用方法 (Usage)
安装并启动插件后，爬行者将自动获得增强的寻路能力无需额外的配置
Once the plugin is installed and started, creepers will automatically have enhanced pathfinding capabilities. No additional configuration is required.

## 构建 (Building from Source)

### 前提条件 (Prerequisites)
*   Git
*   Maven
*   Java 21 或更高版本

### 步骤 (Steps)
1.  **克隆仓库 (Clone the Repository)**:
    ```bash
    git clone https://github.com/MsxMeowStar/CreeperFoundyou.git
    cd CreeperFoundyou
    ```

2.  **构建项目 (Build the Project)**:
    ```bash
    mvn clean package
    ```
    这将在 `target/` 目录下生成 `mscreeperseeu-1.0.jar` 文件
    This will generate the `mscreeperseeu-1.0.jar` file in the `target/` directory.

3.  **部署 (Deployment)**:
    将生成的 `.jar` 文件复制到你的PurpurMC服务器的 `plugins/` 文件夹中
    Copy the generated `.jar` file to your PurpurMC server's `plugins/` folder.

## 贡献 (Contributing)
欢迎贡献！如果你有任何建议或发现bug，请随时提交Issue或Pull Request
Contributions are welcome! If you have any suggestions or find bugs, feel free to open an issue or submit a pull request.

## 许可证 (License)
本项目采用MIT许可证详情请参阅 `LICENSE` 文件
This project is licensed under the MIT License. See the `LICENSE` file for details.
