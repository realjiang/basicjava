# 单例模式
 - 优点
    - 在内存中只有一个对象，节省内存空间
    - 避免频繁的创建销毁对象，提高性能
    - 避免对共享资源的多重占用
 - 缺点
    - 扩展比较困难
    - 如果实例化后的对象长期不利用，系统将默认为垃圾进行回收，造成对象状态丢失
 - 使用场景
    - 创建对象时占用资源过多，但同时又需要用到该类对象
    - 对系统内资源要求统一读写，如读写配置信息
    - 当多个实例存在可能引起程序逻辑错误，如号码生成器
    