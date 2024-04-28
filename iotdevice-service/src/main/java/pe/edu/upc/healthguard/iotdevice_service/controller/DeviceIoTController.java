package pe.edu.upc.healthguard.iotdevice_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.healthguard.iotdevice_service.model.dtos.DeviceIoTRequest;
import pe.edu.upc.healthguard.iotdevice_service.model.dtos.DeviceIoTResponse;
import pe.edu.upc.healthguard.iotdevice_service.model.entities.DeviceIoT;
import pe.edu.upc.healthguard.iotdevice_service.service.DeviceIoTService;

import java.util.List;

@RestController
@RequestMapping("/api/deviceIoT")
@RequiredArgsConstructor
public class DeviceIoTController {

    private final DeviceIoTService deviceIoTService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addDeviceIoT(@RequestBody DeviceIoTRequest deviceIoTRequest) {
        deviceIoTService.addDeviceIoT(deviceIoTRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DeviceIoTResponse> getAllDeviceIoTs() {
        return deviceIoTService.getAllDeviceIoTs();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateDeviceIoT(@PathVariable("id") long id, @RequestBody DeviceIoTRequest deviceIoTRequest) {
        deviceIoTService.updateDeviceIoT(id, deviceIoTRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDeviceIoT(@PathVariable("id") long id) {
        deviceIoTService.deleteDeviceIoT(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DeviceIoTResponse getDeviceIoTById(@PathVariable("id") long id) {
        return deviceIoTService.getDeviceIoTById(id);
    }
}

