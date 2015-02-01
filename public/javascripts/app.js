//Model
function Engine(id, name, category, power, RPM, weight, 
                dimensions, displacement, imglink) {
    this.id = ko.observable(id);
    this.name = ko.observable(name);
    this.category = ko.observable(category);
    this.power = ko.observable(power);
    this.RPM = ko.observable(RPM);
    this.weight = ko.observable(weight);
    this.dimensions = ko.observable(dimensions);
    this.displacement = ko.observable(displacement);
    this.imglink = ko.observable(imglink);
}
function Acc(id, name, SKU, URL) {
    this.id = id;
    this.name = name;
    this.SKU = SKU;
    this.URL = URL;
}
function Req(param) { this.param = param; }
//ViewModel
function EngineAccViewModel() {
    var self = this;
    self.engines = ko.observableArray([]);      // Массив двигателей
    self.accs = ko.observableArray([]);         // Массив аксессуаров
    self.name = ko.observable("");              // Имя
    self.category = ko.observable("");          // Тип
    self.power = ko.observable("");             // Мощность
    self.RPM = ko.observable(0);                // Макс. обороты
    self.weight = ko.observable(0);             // Вес
    self.dimensions = ko.observable("");        // Габариты
    self.displacement = ko.observable("");        // Объем  двигателя
    self.imglink = ko.observable("");           // Ссылка на изображение
    self.page = ko.observable("index");         // Страница
    // Загрузить двигатели
    self.loadengines = function(cat) {
        self.engines.destroyAll();
        self.page("engines");
        jsRoutes.controllers.Engines.getenginesbycat().ajax({
            data: new Req(cat),
            success: function(data) {
                self.engines.valueWillMutate();
                self.engines([]);
                for (i = 0; i < data.objects.length; i++) {
                    var o = data.objects[i];
                    self.engines.push(new Engine(o.id,
                        o.name, o.category.name, o.power, 
                        o.RPM, o.weight, o.dimensions,
                        o.displacement, o.imglink));
                }
                self.engines.valueHasMutated();
            }, error: function(data) { alert("Произошла ошибка!\n" + data.error()); }
        });
    }
    // Загрузить двигатели для аксессуара
    self.loadenginesforacc = function(acc) {
        self.engines.destroyAll();
        self.page("engines");
        jsRoutes.controllers.Engines.getenginesbyacc().ajax({
            data: new Req(acc),
            success: function(data) {
                self.engines.valueWillMutate();
                self.engines([]);
                for (i = 0; i < data.objects.length; i++) {
                    var o = data.objects[i];
                    self.engines.push(new Engine(o.id,
                        o.name, o.category.name, o.power,
                        o.RPM, o.weight, o.dimensions,
                        o.displacement, o.imglink));
                }
                self.engines.valueHasMutated();
            }, error: function(data) { alert("АЛЯРМ ошибка!" + data.error()); }
        });
    }
    // Загрузить комплектующие
    self.loadaccs = function(id) {
        self.accs.destroyAll();
        jsRoutes.controllers.Engines.getaccsforengine().ajax({
            data: new Req(id),
            success: function(data) {
                self.accs.valueWillMutate();
                self.accs([]);
                for (i = 0; i < data.objects.length; i++) {
                    var o = data.objects[i];
                    self.accs.push(new Acc(o.id, o.name, o.SKU, o.URL));
                }
                self.accs.valueHasMutated();
            }, error: function(data) { alert("АЛЯРМ ошибка!\n" + data.error()); }
        });
    }
    // Загрузить двигатель
    self.loadengine = function(id) {
        self.page("engine");
        var o = self.engines()[id];
        self.name(o.name());
        self.category(o.category());
        self.power(o.power());
        self.RPM(o.RPM());
        self.weight(o.weight());
        self.dimensions(o.dimensions());
        self.displacement(o.displacement());
        self.imglink(o.imglink());
        self.loadaccs(id);
    }
}
ko.applyBindings(new EngineAccViewModel());